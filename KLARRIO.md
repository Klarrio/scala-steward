# [OBSOLETE] Klarrio Fork of Scala Steward

## Original reason for fork
The last official release of scala steward at the time of the fork was v0.14, dd 25/01/22. 
Since that release there had been quite some updates, including a
(small) feature that we need for our CI/CD efforts: PR-labeling, using
the `add-labels` CLI option.

## Current status
* Scala steward has released v0.15, which includes the feature originally required.
* github actions were updated to use the offical release

## Changes to upstream
* changes to [build.sbt](build.sbt) for pushing the scala-steward-core artifact to the
Klarrio JFrog repository.


