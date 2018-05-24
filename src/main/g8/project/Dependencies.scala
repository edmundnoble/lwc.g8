package quasar.$connectorType$.project

import scala.Boolean
import scala.collection.Seq

import sbt._

object Dependencies {
  // quasar version with LWC support
  private val quasarVersion       = "42.1.1"

  // the connector's dependencies, excluding quasar.
  def lwcCore = Seq(
  )

  // we need to separate quasar out from the LWC dependencies,
  // to keep from packaging it and its dependencies.
  def lwc = lwcCore ++ Seq(
    "org.quasar-analytics"       %% "quasar-mimir-internal"     % quasarVersion
  )

  // extra dependencies for integration tests, for now.
  def it = lwc
}
