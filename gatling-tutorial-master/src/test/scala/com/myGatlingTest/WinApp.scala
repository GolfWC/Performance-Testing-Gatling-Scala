package com.myGatlingTest

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class WinApp extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.winlearning.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36 Edg/132.0.0.0")

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1")

	val headers_1 = Map(
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://www.winlearning.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_4 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"if-modified-since" -> "Thu, 30 Jan 2025 06:53:50 GMT",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_5 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_6 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"priority" -> "u=0, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1")

	val headers_7 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"if-modified-since" -> "Thu, 30 Jan 2025 06:53:52 GMT",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_8 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_9 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

    val uri1 = "https://webfonts.zoho.com/css"
    val uri2 = "https://widgets.pinterest.com/v1/urls/count.json"
    val uri4 = "https://salesiq.zohopublic.com/visitor/v2/channels/website"
    val uri5 = "https://salesiq.zoho.com/widget"
    val uri6 = "https://insight.adsrvr.org/track/up"

	val scn = scenario("WinApp")
		.exec(http("request_0")
			.get("/Solutions/Courseware/digital-skills-courseware")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri1 + "?family=Roboto:100,300,400,500,700,900/Unna:400,700/Prata/Verdana:400/georgia:400/Raleway:100,300,400/Noto%20Sans:100,300,400/Lato:400,700/Lora/Karla/Source%20Sans%20Pro:100,300,400/Muli:100,300,400/Great%20Vibes/Rubik:300,400,500,700,900/Roboto:300,400,500,700,900,100/Nunito&display=swap")
			.headers(headers_1),
            http("request_2")
			.get(uri5)
			.headers(headers_1),
            http("request_3")
			.get(uri4 + "?widgetcode=c19d27c7dfedc895e49f63a95ae2895b4e7f9ff356b0b87c76f86434a6f12e3f5d5fe629768af6d9a03793700d9418c2&internal_channel_req=true&last_modified_time=1629904304291&version=V26&browser_language=en&current_domain=https%3A%2F%2Fwinlearning.com&pagetitle=Digital%20Skills%20Courseware%20%7C%20Skills%20for%20the%20Modern%20Workplace%20-%20WIN%20Learning")
			.headers(headers_3),
            http("request_4")
			.get("/site-conf.json")
			.headers(headers_4),
            http("request_5")
			.get("/portaluser/getCurrentPortalUser")
			.headers(headers_5),
            http("request_6")
			.get(uri6 + "?adv=j1put77&ref=https%3A%2F%2Fwww.winlearning.com%2FSolutions%2FCourseware%2Fdigital-skills-courseware&upid=g0c6bd9&upv=1.1.0&paapi=1")
			.headers(headers_6),
            http("request_7")
			.get("/ZCMS_socialshare")
			.headers(headers_7),
            http("request_8")
			.get(uri2 + "?source=6&url=https%3A%2F%2Fwww.winlearning.com%2FSolutions%2FCourseware%2Fdigital-skills-courseware&callback=socialShare.pinterestCallBack")
			.headers(headers_8),
            http("request_9")
			.get("/siteapps/socialsharecount?social_media_name=facebook&sharer_id=https%3A%2F%2Fwww.winlearning.com%2FSolutions%2FCourseware%2Fdigital-skills-courseware&callback=socialShare.facebookCallBack")
			.headers(headers_9)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}