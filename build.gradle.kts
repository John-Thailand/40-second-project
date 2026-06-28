tasks.register<Copy>("copyMessage") {
  from("important-message.txt")
  into(layout.buildDirectory)
}
