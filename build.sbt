def makeAgentOptions(classpath:Classpath) : String = {
  val jammJar = classpath.map(_.data).filter(_.toString.contains("jamm")).head
  s"-javaagent:$jammJar"
}

javaOptions in Test <+= (dependencyClasspath in Test).map(makeAgentOptions)

libraryDependencies += "com.github.jbellis" % "jamm" % "0.3.0"

fork := true
