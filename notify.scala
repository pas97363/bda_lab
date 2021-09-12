abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification

object notify {
  def showNotification (notify : Notification) : String = {
    notify match {
      case Email(sender, title, msg) =>
        s"You got an email from $sender \nTitle:\n\t '$title' '$msg'\n"
      case SMS(caller, msg) =>
        s"\nYou got an SMS from '$caller'\n Message: \n\t'$msg'\n\n"
    }
  }
  def main(args: Array[String]): Unit = {
    var email=Email("praj05140@gmail.com","Holla","How are you?")
    var sms=SMS("+918322767087","Holla, How are You?")
    println(showNotification(email))
    println(showNotification(sms))
  }
}