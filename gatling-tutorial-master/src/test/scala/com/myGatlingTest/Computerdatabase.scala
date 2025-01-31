package com.myGatlingTest

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Computerdatabase extends Simulation {

	val httpProtocol = http
		.baseUrl("https://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36 Edg/132.0.0.0")

	val headers_0 = Map(
		"cache-control" -> "max-age=0",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "none",
		"sec-fetch-user" -> "?1")

	val headers_1 = Map(
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1")

	val headers_2 = Map(
		"cache-control" -> "max-age=0",
		"origin" -> "https://computer-database.gatling.io",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1")



	val scn = scenario("Computerdatabase")
		.exec(http("ComputerDatabasePage")
			.get("/computers")
			.headers(headers_0))
		.pause(3)
		.exec(http("NewComputerPage")
			.get("/computers/new")
			.headers(headers_1))
		.pause(73)
		.exec(http("CreateNewComputer")
			.post("/computers")
			.headers(headers_2)
			.formParam("name", "MyComputer1")
			.formParam("introduced", "2024-02-02")
			.formParam("discontinued", "2025-01-01")
			.formParam("company", "1"))
		.pause(14)
		.exec(http("FilterComputer")
			.get("/computers?f=MyComputer1")
			.headers(headers_1))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}