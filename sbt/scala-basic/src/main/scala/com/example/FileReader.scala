package com.example

import scala.io.Source
import scala.util.Using

class FileReader {

  def readFile(fileName: String): Option[List[String]] =
    Option(getClass.getResourceAsStream(s"/$fileName")).map { stream =>
      Using.resource(Source.fromInputStream(stream)) { source =>
        source.getLines().toList
      }
    }
}
