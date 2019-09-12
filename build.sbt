lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "circe_akka_js_sbt",
    scalaVersion := "2.12.9",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "io.circe" %%% "circe-core" % "0.11.1",
      "io.circe" %%% "circe-generic" % "0.11.1",
      "io.circe" %%% "circe-java8" % "0.11.1",
      "org.akka-js" %%% "akkajsactor" % "1.2.5.23"
    )
  )
