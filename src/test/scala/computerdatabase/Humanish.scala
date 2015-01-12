package computerdatabase

/**
 * Created by tim on 1/7/15.
 */

trait Animal

final case class Dog(name: String) extends Animal

final case class Cat(name: String) extends Animal

object Humanish {

  // the type class.
  // defines an abstract method named 'speak'.
  trait HumanLike[A] {
    def speak(speaker: A): Unit
  }

  // companion object
  object HumanLike {

    // implement the behavior for each desired type. in this case, // only for a Dog.
    implicit object DogIsHumanLike extends HumanLike[Dog] {
      def speak(dog: Dog) {
        println(s"I'm a Dog, my name is ${dog.name}")
      }
    }

  }

}
