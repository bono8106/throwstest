package throwstest

trait ThrowingInterface {
  @throws(classOf[Exception]) def throwingMethod()
}
