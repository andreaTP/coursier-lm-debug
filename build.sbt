// disablePlugins(coursier.CoursierPlugin)

useCoursier := true

update := {
  println("DEBUG update!!!")
  update.value
}
updateClassifiers := {
  println("DEBUG updateClassifiers!!!")
  updateClassifiers.value
}
updateSbtClassifiers := {
  println("DEBUG updateSbtClassifiers!!!")
  updateSbtClassifiers.value
}

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "12.5.17"
)
