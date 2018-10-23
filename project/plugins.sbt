disablePlugins(coursier.CoursierPlugin)

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M7")

useCoursier := true

import coursier.{Tasks, Keys, Cache, CachePolicy}

coursierParallelDownloads := 6
coursierMaxIterations := 100
coursierChecksums := Seq(Some("SHA-1"), None)
coursierArtifactsChecksums := Seq(None)
coursierCachePolicies := CachePolicy.default
coursierTtl := Cache.defaultTtl
coursierVerbosity := 5
mavenProfiles := Set.empty
coursierUseSbtCredentials := true
coursierCredentials := Map.empty
coursierCache := Cache.default
coursierReorderResolvers := true
coursierKeepPreloaded := false
coursierCreateLogger := { () => new coursier.TermDisplay(new java.io.OutputStreamWriter(System.err)) }

coursierProject := Tasks.coursierProjectTask.value
coursierConfigGraphs := Tasks.ivyGraphsTask.value
coursierInterProjectDependencies := Tasks.coursierInterProjectDependenciesTask.value
coursierPublications := Tasks.coursierPublicationsTask().value
coursierSbtClassifiersModule := classifiersModule.in(updateSbtClassifiers).value
coursierConfigurations := Tasks.coursierConfigurationsTask(None).value
coursierParentProjectCache := Tasks.parentProjectCacheTask.value
coursierResolutions := Tasks.resolutionsTask().value
coursierFallbackDependencies := Tasks.coursierFallbackDependenciesTask.value
coursierArtifacts := Tasks.artifactFilesOrErrors(withClassifiers = false).value
// coursierSignedArtifacts := Tasks.artifactFilesOrErrors(withClassifiers = false, includeSignatures = true).value
// coursierClassifiersArtifacts := Tasks.artifactFilesOrErrors(
//   withClassifiers = true
// ).value
// coursierSbtClassifiersArtifacts := Tasks.artifactFilesOrErrors(
//   withClassifiers = true,
//   sbtClassifiers = true
// ).value
coursierResolvers := Tasks.coursierResolversTask.value
coursierRecursiveResolvers := Tasks.coursierRecursiveResolversTask.value

// update := {
//   println("DEBUG update!!!")
//   val res: sbt.librarymanagement.UpdateReport =
//   coursier.Tasks.updateTask(
//     None,
//     withClassifiers = false
//   ).value

//   println("DEBUG!")
//   println(res)

//   res
// }
update := {
  println("DEBUG update!!!")
  val res = update.value

  println("DEBUG!")
  println(res)

  res
}
updateClassifiers := {
  println("DEBUG updateClassifiers!!!")
  updateClassifiers.value
}
updateSbtClassifiers := {
  println("DEBUG updateSbtClassifiers!!!")
  updateSbtClassifiers.value
}

// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.8")
