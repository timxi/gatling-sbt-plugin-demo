

import scala.reflect.io.File

object IDEPathHelper {

	val gatlingConfUrl = getClass.getClassLoader.getResource("gatling.conf").getPath
	val projectRootDir = File(gatlingConfUrl).parents(3)

	val mavenSourcesDirectory = projectRootDir / "src" / "test" / "scala"
	val mavenResourcesDirectory = projectRootDir / "src" / "test" / "resources"
	val mavenTargetDirectory = projectRootDir / "target"
	val mavenBinariesDirectory = projectRootDir / "target/scala-2.11/gatling-classes"

	val dataDirectory = mavenResourcesDirectory / "data"
	val requestBodiesDirectory = mavenResourcesDirectory / "request-bodies"

	val recorderOutputDirectory = mavenSourcesDirectory
	val resultsDirectory = mavenTargetDirectory / "results"

	val recorderConfigFile = (mavenResourcesDirectory / "recorder.conf").toFile
}