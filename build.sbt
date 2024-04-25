enablePlugins(GatlingPlugin)

scalaVersion := "3.4.0"

val gatlingVersion = "3.10.5"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test,it"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test,it"