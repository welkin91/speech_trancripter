
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.10/semantic.css">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"
            type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*20.70*/("""" 
            type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.10/semantic.js" 
            type="text/javascript"></script>
    </head>
    <body>
        <div class="ui top attached demo menu">
            <a class="item">
                <i class="sidebar icon"></i>
                Menu
            </a>
        </div>
        <div class="ui bottom attached segment pushable">
            <div class="ui inverted labeled icon left inline vertical sidebar menu uncover visible">
                <a class="item" id='upload_button'>
                    <i class="upload icon"></i>
                    Upload a file
                </a>
                <a class="item" id="show_button">
                    <i class="block layout icon"></i>
                    View all files
                </a>
            </div>
            <div class="pusher" style="margin-left: -9%; margin-top: 2%">
                <div class="ui basic segment">
                    <div class="container" id='upload_div'>
                        <div class="ui card">
                            <div class="content">
                                <h4 class="ui sub header">Activity</h4>
                                <div class="ui small feed">
                                    <!-- <div class="event">
                                        <div class="content">
                                            <div class="summary">
                                                <a>Elliot Fu</a> added <a>Jenny Hess</a> to the project
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event">
                                        <div class="content">
                                            <div class="summary">
                                                <a>Stevie Feliciano</a> was added as an <a>Administrator</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="event">
                                        <div class="content">
                                            <div class="summary">
                                                <a>Helen Troy</a> added two pictures
                                            </div>
                                        </div>
                                    </div> -->
                                    
                                    """),format.raw/*73.60*/("""
                                    """),_display_(/*74.38*/content),format.raw/*74.45*/("""
                                    """),format.raw/*75.46*/("""
                                        """),format.raw/*76.87*/("""
                                            """),format.raw/*77.74*/("""
                                            """),format.raw/*78.68*/("""
                                        """),format.raw/*79.95*/("""
                                    """),format.raw/*80.47*/("""
                                    """),format.raw/*81.60*/("""
                                        """),format.raw/*82.74*/("""
                                            """),format.raw/*83.89*/("""
                                            """),format.raw/*84.109*/("""
                                                """),format.raw/*85.90*/("""
                                                """),format.raw/*86.136*/("""
                                            """),format.raw/*87.57*/("""
                                        """),format.raw/*88.51*/("""
                                    """),format.raw/*89.47*/("""

                                """),format.raw/*91.33*/("""</div>
                            </div>
                            <div class="extra content">
                                <button class="ui button upload" id="upload_submit">Upload</button>
                            </div>
                        </div>
                    </div>
                    <div class="container" id='show_div'>
                        
                    </div>    
                    
                </div>
            </div>
        </div>
        
  

                

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue May 23 16:46:20 IST 2017
                  SOURCE: /Users/aneesha.bahukhandi/PLAY/speech_trancripter/app/views/main.scala.html
                  HASH: 2ad35c761e2e9e537c3fd706481bd79894f46525
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1421->481|1436->487|1499->528|1713->715|1728->721|1789->760|1967->911|1982->917|2044->958|4713->3717|4778->3755|4806->3762|4871->3808|4940->3895|5013->3969|5086->4037|5155->4132|5220->4179|5285->4239|5354->4313|5427->4402|5501->4511|5578->4601|5656->4737|5729->4794|5798->4845|5863->4892|5925->4926
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|47->17|47->17|47->17|50->20|50->20|50->20|102->73|103->74|103->74|104->75|105->76|106->77|107->78|108->79|109->80|110->81|111->82|112->83|113->84|114->85|115->86|116->87|117->88|118->89|120->91
                  -- GENERATED --
              */
          