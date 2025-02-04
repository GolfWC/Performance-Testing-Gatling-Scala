package com.myGatlingTest

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://omns.americanexpress.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36 Edg/132.0.0.0")

	val headers_0 = Map(
		"Accept" -> "text/html",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_2 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"x-dtpc" -> "$428235069_991h16vORSRIUIQSGUPCMFLPGKUTDSWFPSKELWS-0e0")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_4 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_6 = Map(
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"accept" -> "application/json",
		"content-type" -> "application/json",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_7 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://oce.americanexpress.com",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_11 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type",
		"access-control-request-method" -> "POST",
		"origin" -> "https://oce.americanexpress.com",
		"priority" -> "u=1, i",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_12 = Map(
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_13 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json",
		"origin" -> "https://oce.americanexpress.com",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_14 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "content-type,one-data-correlation-id",
		"access-control-request-method" -> "POST",
		"origin" -> "https://oce.americanexpress.com",
		"priority" -> "u=1, i",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_15 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/json",
		"one-data-correlation-id" -> "79aae3bc-08d9-4055-bc57-13b298ba27f1",
		"origin" -> "https://oce.americanexpress.com",
		"priority" -> "u=1, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

	val headers_16 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_18 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br, zstd",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://oce.americanexpress.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"x-dtreferer" -> "https://oce.americanexpress.com/myca/gce/us/action/home?request_type=un_Register&Face=en_US#/splash")

	val headers_19 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"priority" -> "i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-site")

	val headers_21 = Map("Content-Type" -> "text/plain;charset=UTF-8")

	val headers_22 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"priority" -> "i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_30 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br, zstd",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://oce.americanexpress.com",
		"priority" -> "u=4, i",
		"sec-ch-ua" -> """Not A(Brand";v="8", "Chromium";v="132", "Microsoft Edge";v="132""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

    val uri01 = "https://q-aus1.contentsquare.net/quota"
    val uri02 = "https://functions.americanexpress.com"
    val uri03 = "https://c.contentsquare.net"
    val uri05 = "https://cdaas.americanexpress.com/myca/oce/latest/content"
    val uri06 = "https://one-xp.americanexpress.com/variant/find"
    val uri07 = "https://www.aexp-static.com/one/universal-session-manager-assets/info.filled.svg"
    val uri08 = "https://iwmap.americanexpress.com/beacon"
    val uri09 = "https://k-aus1.contentsquare.net/v2/recording"
    val uri10 = "https://oce.americanexpress.com/myca/oce"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get(uri05 + "/html/oce-card-input.html")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri05 + "/html/oce-loader.html")
			.headers(headers_1),
            http("request_2")
			.post(uri10 + "/action/logflow?request_type=un_Register&Face=en_US")
			.headers(headers_2)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0002_request.json")),
            http("request_3")
			.options(uri06)
			.headers(headers_3),
            http("request_4")
			.get(uri05 + "/images/common/double-cid-reredesign.svg")
			.headers(headers_4),
            http("request_5")
			.get(uri05 + "/images/common/cm15-double-card-revamp.svg")
			.headers(headers_4),
            http("request_6")
			.post(uri06)
			.headers(headers_6)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0006_request.json")),
            http("request_7")
			.get(uri02 + "/ReadScriptRegistry.v1?name=ensighten&version=%5E1.0.0&environment=e3&cache=1738628")
			.headers(headers_7),
            http("request_8")
			.get(uri02 + "/ReadScriptRegistry.v1?name=one-identity-session&version=%5E1.0.0&environment=e3&cache=1738628")
			.headers(headers_7),
            http("request_9")
			.get(uri02 + "/ReadScriptRegistry.v1?name=user-consent-management&version=%5E1.0.0&environment=e3&cache=1738628")
			.headers(headers_7),
            http("request_10")
			.get(uri02 + "/ReadScriptRegistry.v1?name=contentsquare&version=%5E1.0.0&environment=e3&cache=1738628")
			.headers(headers_7),
            http("request_11")
			.options(uri08)
			.headers(headers_11),
            http("request_12")
			.get(uri07)
			.headers(headers_12),
            http("request_13")
			.post(uri08)
			.headers(headers_13)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0013_request.json")),
            http("request_14")
			.options(uri02 + "/UpdateUserSession.v1")
			.headers(headers_14),
            http("request_15")
			.post(uri02 + "/UpdateUserSession.v1")
			.headers(headers_15)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0015_request.json"))
			.check(status.is(401)),
            http("request_16")
			.post(uri10 + "/rb_8264482b-dee3-4f6d-be79-c4d3fee1d8c7?type=js3&sn=v_4_srv_109_sn_NRAHQE4762PO2LFUV9597BJQ6RK5CVDE_perc_100000_ol_0_mul_1_app-3A805648a8067aac83_1_app-3A427a99fc5dc04249_1_rcs-3Acss_0&flavor=post&vi=ORSRIUIQSGUPCMFLPGKUTDSWFPSKELWS-0&modifiedSince=1738264410478&rf=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3Frequest_type%3Dun_Register%26Face%3Den_US%23%2F&bp=3&app=427a99fc5dc04249&crc=4085967853&en=jf4wyxxa&end=1")
			.headers(headers_16)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0016_request.txt")),
            http("request_17")
			.post(uri10 + "/rb_8264482b-dee3-4f6d-be79-c4d3fee1d8c7?type=js3&sn=v_4_srv_109_sn_NRAHQE4762PO2LFUV9597BJQ6RK5CVDE_perc_100000_ol_0_mul_1_app-3A805648a8067aac83_1_app-3A427a99fc5dc04249_1_rcs-3Acss_0&flavor=post&vi=ORSRIUIQSGUPCMFLPGKUTDSWFPSKELWS-0&modifiedSince=1738264410478&rf=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3Frequest_type%3Dun_Register%26Face%3Den_US%23%2F&bp=3&app=427a99fc5dc04249&crc=3445494601&en=jf4wyxxa&end=1")
			.headers(headers_16)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0017_request.txt")),
            http("request_18")
			.post(uri10 + "/rb_8264482b-dee3-4f6d-be79-c4d3fee1d8c7?type=js3&sn=v_4_srv_109_sn_NRAHQE4762PO2LFUV9597BJQ6RK5CVDE_perc_100000_ol_0_mul_1_app-3A805648a8067aac83_1_app-3A427a99fc5dc04249_1_rcs-3Acss_0&flavor=post&vi=ORSRIUIQSGUPCMFLPGKUTDSWFPSKELWS-0&modifiedSince=1738264410478&rf=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3Frequest_type%3Dun_Register%26Face%3Den_US%23%2Fsplash&bp=3&app=427a99fc5dc04249&crc=1578614658&en=jf4wyxxa&end=1")
			.headers(headers_18)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0018_request.txt"))))
		.pause(1)
		.exec(http("request_19")
			.get("/b/ss/amexpressenterpriseprod/1/JS-2.17.0/s47424148853829?AQB=1&ndh=1&pf=1&t=3%2F1%2F2025%2019%3A17%3A36%201%20300&mid=14089928521636610650238022694177652190&ce=UTF-8&ns=1americanexpress&fpCookieDomainPeriods=2&cl=33955200&pageName=US%7CAMEX%7CSer%7COCE%7CCardInput&g=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3Frequest_type%3Dun_register%26face%3Den_us%23%2F&c.&cm.&ssf=1&.cm&omn.&pagename=CardInput&hierarchy=US%7CAMEX%7CSer%7COCE&language=en&newpagename=yes&ReqId=9435&PageId=21093&rwd=rwd&itagerror=omn.cardtype%20is%20missingomn.appconfig%20is%20missing&conversiontype=US%3ASer%3AOCE%3AMYCAReg&visitorCheck=VisitorAPI%20Present&itagexists=yes&ppvpage=us%7Coneamex%7Cser%7Cen-us%7Caccount%7Clogin&ppvtotal=50&ppvinitial=50&etwidth=743&etheight=885&etratio=1.1911170928667565&etorientation=portrait&.omn&.c&cc=USD&server=oce.americanexpress.com&h1=US%7CAMEX%7CSer%7COCE&c4=US&v22=D%3Dgctrac&v41=us%7Coneamex%7Cser%7Cen-us%7Caccount%7Clogin&c46=DLS%20Navigation&c48=D%3Dgctrac&c49=ENS-Ser%20r28.7.0.-AM%3A2.17.0-VISID%3A5.0.1-DIL%3ANA-Mbox%3ANA-CSVisID%3Anull-msuite%3Atrue-esuite%3Atrue-IHC%3Afalse-A111&v65=D%3Domnmycademo&c75=npn&v94=D%3Dagent-id&v140=UCM%3A%20en-US%7C%20ensMarket%3A%20en-US%7C%20hier%3A%20US%7C&s=1504x1003&c=24&j=1.6&v=N&k=Y&bw=758&bh=885&mcorgid=5C36123F5245AF470A490D45%40AdobeOrg&AQE=1")
			.headers(headers_19)
			.resources(http("request_20")
			.post(uri10 + "/rb_8264482b-dee3-4f6d-be79-c4d3fee1d8c7?type=js3&sn=v_4_srv_109_sn_NRAHQE4762PO2LFUV9597BJQ6RK5CVDE_perc_100000_ol_0_mul_1_app-3A805648a8067aac83_1_app-3A427a99fc5dc04249_1_rcs-3Acss_0&flavor=post&vi=ORSRIUIQSGUPCMFLPGKUTDSWFPSKELWS-0&modifiedSince=1738264410478&rf=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3Frequest_type%3Dun_Register%26Face%3Den_US%23%2F&bp=3&app=427a99fc5dc04249&crc=1968954364&en=jf4wyxxa&end=1")
			.headers(headers_16)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0020_request.txt")),
            http("request_21")
			.post(uri01 + "?ct=0")
			.headers(headers_21)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0021_request.txt")),
            http("request_22")
			.get(uri03 + "/pageEvent?value=H4sIAAAAAAAAAw3JsQEAMAgCsJcAFeX%2Fx9qsYeMS3Ygum%2FBAdZCc5q5%2FBA%2BZQhPOJgAAAA%3D%3D&ct=2&isETR=false&isCustomHashId=false&v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&r=061498")
			.headers(headers_22),
            http("request_23")
			.get(uri03 + "/pageEvent?value=H4sIAAAAAAAAAwsNrnH0dY2oCU4tqvF3dq1xTixK8cwrKC0BAN5QNCAZAAAA&ct=2&isETR=false&isCustomHashId=false&v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&r=156872")
			.headers(headers_22),
            http("request_24")
			.get(uri03 + "/pageEvent?value=H4sIAAAAAAAAA3NMTw%2FwqwkNrnH0dY2oCU4tqvF3dq1xTixK8cwrKC0BAOavuYsfAAAA&ct=2&isETR=false&isCustomHashId=false&v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&r=595173")
			.headers(headers_22),
            http("request_25")
			.get(uri03 + "/pageview?ex=&dt=177&pvt=n&cvars=%7B%226%22%3A%5B%22Page%20Name%22%2C%22US%7CAMEX%7CSer%7COCE%7CCardInput%22%5D%7D&cvarp=%7B%226%22%3A%5B%22Page%20Name%22%2C%22US%7CAMEX%7CSer%7COCE%7CCardInput%22%5D%7D&la=en-US&uc=1&url=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3F__%2F%3Frequest_type%3Dun_Register%26Face%3Den_US&dr=&dw=743&dh=1523&ww=758&wh=885&sw=1504&sh=1003&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&sn=1&hd=1738628256&v=15.33.7&pid=3776&pn=1&r=261788")
			.headers(headers_22),
            http("request_26")
			.get(uri03 + "/pageEvent?value=H4sIAAAAAAAAA0s1MTEzN7SwNEwxNUtKSzQ1NDdINTNJNDQ1Mk8FslJTjSxTzFMTLQDz8WkkKAAAAA%3D%3D&ct=2&isETR=false&isCustomHashId=true&v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&r=237077")
			.headers(headers_22),
            http("request_27")
			.get(uri03 + "/dvar?v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&dv=H4sIAAAAAAAAA0XQX0vDMBQF8K8S8rTB2iZpmjXbU9lEZVaEVffgpKTNzQyLbWkr%2Fhn77maCyHm7hx9czgk%2FDtBnB2hGvMB5%2B22dU1ESEjTZ2Ua3HwO6LxAlIVkifxB8iT4Fn6Ks6xzsoNrYMUrieRgLNNncFPndDDl7BHQN9bGdotVr375BRGMWkkvQVhnV2z9ypQ%2F%2FHZ7hfPV0u%2FZ%2FUE5SKVmaMCpiISgRCWFxShgTktP5XPhCXkD2kJfrotzCMNi2%2BbVcQFJ5EcgKdKC0VoGhKg2gVpwLYpigMqTeGgtOl6pR7mu09VCad%2Be8P%2B1x14PxO4De48XzyxmffwBcW8gGJgEAAA%3D%3D&ct=2&r=159542")
			.headers(headers_22),
            http("request_28")
			.post(uri10 + "/rb_8264482b-dee3-4f6d-be79-c4d3fee1d8c7?type=js3&sn=v_4_srv_109_sn_NRAHQE4762PO2LFUV9597BJQ6RK5CVDE_perc_100000_ol_0_mul_1_app-3A805648a8067aac83_1_app-3A427a99fc5dc04249_1_rcs-3Acss_0&flavor=post&vi=ORSRIUIQSGUPCMFLPGKUTDSWFPSKELWS-0&modifiedSince=1738264410478&rf=https%3A%2F%2Foce.americanexpress.com%2Fmyca%2Fgce%2Fus%2Faction%2Fhome%3Frequest_type%3Dun_Register%26Face%3Den_US%23%2F&bp=3&app=427a99fc5dc04249&crc=1397001127&en=jf4wyxxa&end=1")
			.headers(headers_16)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0028_request.txt")),
            http("request_29")
			.post(uri09 + "?rt=5&rst=1738628257021&let=1738628257028&v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&ri=1&ct=2")
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0029_request.bin"))))
		.pause(3)
		.exec(http("request_30")
			.post(uri03 + "/v2/events?uu=46e5b106-9bed-adda-f1a8-eca4460f2619&sn=1&hd=1738628256&v=15.33.7&pid=3776&pn=1&str=94&di=815&dc=1163&fl=1166&sr=58&mdh=1523&ct=0")
			.headers(headers_30)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0030_request.txt"))
			.resources(http("request_31")
			.post(uri09 + "?rt=5&rst=1738628257021&let=1738628257028&v=15.33.7&pid=3776&pn=1&sn=1&uu=46e5b106-9bed-adda-f1a8-eca4460f2619&ri=2&ct=0")
			.headers(headers_30)
			.body(RawFileBody("com/myGatlingTest/recordedsimulation/0031_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}