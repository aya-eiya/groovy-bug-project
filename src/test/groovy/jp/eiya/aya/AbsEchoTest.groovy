package jp.eiya.aya
import spock.lang.Specification

class AbsEchoTest extends Specification{
  static class StringEchoForTest extends AbsEcho<String>{
     @Override
     String echo(Object obj){
        obj.toString()
     }
  }

  static stringEcho = new StringEchoForTest()

  def 'Can echo an Strgng value?'(){
    expect:
    stringEcho.echo(value) == value

    where:
    value << ['a','b','c']
  }
}
