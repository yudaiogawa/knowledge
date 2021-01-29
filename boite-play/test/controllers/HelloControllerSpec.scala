package controllers

import org.scalatestplus.play.PlaySpec
import play.api.test.FakeRequest
import play.api.test.Helpers._

class HelloControllerSpec extends PlaySpec {

  def controller = new HelloController(stubControllerComponents())

  "get" should {
    "path a name" in {
      val name = "namae"
      val result = controller.get(Some(name))(FakeRequest())
      assert(status(result) === 200)
      assert(contentAsString(result) === s"Hello, $name :)")
    }

    "not path a name" in {
    val result = controller.get(None)(FakeRequest())
    assert(status(result) === 200)
    assert(contentAsString(result) === "Please give a name")
    }
  }
}
