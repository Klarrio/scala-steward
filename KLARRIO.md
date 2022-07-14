# Klarrio Fork of Scala Steward

## Reason for fork
The last official release of scala steward is v0.14, dd 25/01/22. 
Since that release there have been quite some updates, including a
(small) feature that we need for our CI/CD efforts: PR-labeling, using
the `add-labels` CLI option.

## Changes to upstream
* changes to [build.sbt](build.sbt) for pushing the scala-steward-core artifact to the
Klarrio JFrog repository.


