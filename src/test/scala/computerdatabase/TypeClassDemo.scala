package computerdatabase

/**
 * Created by tim on 1/7/15.
 */
object TypeClassDemo extends App {
  import Humanish.HumanLike
  // create a method to make an animal speak
  def makeHumanLikeThingSpeak[A](animal: A)(implicit humanLike: HumanLike[A]) {
    println(humanLike == HumanLike.DogIsHumanLike)
    humanLike.speak(animal)
  }
  // because HumanLike implemented this for a Dog, it will work
  makeHumanLikeThingSpeak(Dog("Rover"))
  // however, the method won't compile for a Cat (as desired)
  //makeHumanLikeThingSpeak(Cat("Morris"))
}
