package com.ringohub.guice

import com.google.inject.AbstractModule

class OnStartGuiceModule extends AbstractModule {
  override def configure() {
    bind(classOf[ApplicationInitialize]).asEagerSingleton()
  }
}

private class ApplicationInitialize {
  println("Sample App on Start!! \uD83D\uDC4B")
}

