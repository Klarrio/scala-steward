addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.14.2")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.2.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.2.16")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.10.0")
addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.9")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.7.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.3.3")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.3")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.3.2")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.0")

// only resolve from Klarrio JFrog
resolvers := Seq(
  "Artifactory klarrio" at "https://klarrio.jfrog.io/klarrio/jvm-libs/"
)
externalResolvers := Resolver.combineDefaultResolvers(resolvers.value.toVector, mavenCentral = false)
credentials += Credentials(Path.userHome / ".ivy2" / ".klarrio-credentials")
