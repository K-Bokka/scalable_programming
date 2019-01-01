import java.io.File

object FileMatcherClosure {
  private def filesHere = (new File(".")).listFiles()

  private def fileMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String) = fileMatching(_.endsWith(query))

  def filesContaining(query: String) = fileMatching(_.contains(query))

  def filesRegex(query: String) = fileMatching(_.matches(query))
}
