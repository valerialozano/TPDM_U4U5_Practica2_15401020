package mx.edu.ittepic.tpdm_u4u5_practica2_15401020

import android.app.AlertDialog
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Lienzo(p:MainActivity) : View(p) {
    var puntero = p
    val mapaTec = Imagen(this, R.drawable.mapita, 22f, 0f)
    var edificio = ""
    val pa = Paint()
    val ca = Canvas()

    //variables bandera
    var ud = false
    var cb = false
    var lc = false
    var uvp = false
    var liia = false
    var entrada = false
    var s = false
    var f = false
    var k = false
    var ad = false
    var ci = false
    var ta = false
    var j = false
    var l = false
    var x = false
    var n = false
    var m = false
    var h = false
    var a = false
    var a2 = false
    var licbi = false
    var p2 = false
    var p = false
    var ee = false
    var g = false
    var g2 = false
    var b2 = false
    var b = false
    var q = false
    var bg = false


    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        //dibujar mapa
        mapaTec.pintar(c)
        pa.style = Paint.Style.FILL
        //dibujar boton de buscar
        pa.color = Color.rgb(232, 75, 41)
        c.drawRect(50f, 1675f, 370f, 1790f, pa)

        //dibujar botón de buscar
        pa.color = Color.BLACK
        pa.textSize = 47f
        pa.color = Color.WHITE
        c.drawText("Buscar", 135f, 1748f, pa)


        //BUSCAR EDIFICIOS
        //Toast.makeText(puntero, edificio, Toast.LENGTH_LONG).show()
        if (!edificio.equals("")) {
            pa.style = Paint.Style.STROKE
            pa.strokeWidth = 15f
            pa.color = Color.YELLOW
            if (edificio.equals("UD") || edificio.equals("ud")) { //ud
                c.drawRect(570f, 1310f, 720f, 1410f, pa)
            } else if (edificio.equals("LC") || edificio.equals("lc") || edificio.equals("laboratorio de computo")) { //laboratorio de cómputo
                c.drawRect(275f, 1340f, 390f, 1450f, pa)
            } else if (edificio.equals("CB") || edificio.equals("cb") || edificio.equals("ciencias basicas") || edificio.equals(
                    "baston"
                )
            ) { //baston
                c.drawRect(275f, 1400f, 550f, 1520f, pa)
            } else if (edificio.equals("UVP") || edificio.equals("uvp")) { //uvp
                c.drawRect(50f, 1380f, 210f, 1500f, pa)
            } else if (edificio.equals("LIIA") || edificio.equals("liia")) { //liia
                c.drawRect(70f, 1170f, 220f, 1320f, pa)
            } else if (edificio.equals("LICBI") || edificio.equals("licbi")) { //licbi
                c.drawRect(120f, 930f, 240f, 1080f, pa)
            } else if (edificio.equals("F") || edificio.equals("f")) { //f
                c.drawRect(280f, 1090f, 383f, 1195f, pa)
            } else if (edificio.equals("K") || edificio.equals("k")) { //k
                c.drawRect(400f, 1090f, 547f, 1150f, pa)
            } else if (edificio.equals("S") || edificio.equals("s")) { //s
                c.drawRect(410f, 1130f, 490f, 1200f, pa)
            } else if (edificio.equals("AD") || edificio.equals("ad")) { //ad
                c.drawRect(580f, 1105f, 680f, 1190f, pa)
            } else if (edificio.equals("CI") || edificio.equals("ci") || edificio.equals("biblioteca")) { //biblioteca
                c.drawRect(680f, 1040f, 820f, 1150f, pa)
            } else if (edificio.equals("TA") || edificio.equals("ta")) { //ta
                c.drawRect(820f, 1040f, 940f, 1170f, pa)
            } else if (edificio.equals("N") || edificio.equals("n")) { //n
                c.drawRect(760f, 985f, 885f, 1050f, pa)
            } else if (edificio.equals("X") || edificio.equals("x")) { //x
                c.drawRect(665f, 985f, 770f, 1047f, pa)
            } else if (edificio.equals("L") || edificio.equals("l")) { //l
                c.drawRect(500f, 1005f, 640f, 1065f, pa)
            } else if (edificio.equals("J") || edificio.equals("j")) { //j
                c.drawRect(380f, 1020f, 515f, 1085f, pa)
            } else if (edificio.equals("H") || edificio.equals("h")) { //h
                c.drawRect(380f, 950f, 510f, 1020f, pa)
            } else if (edificio.equals("M") || edificio.equals("m")) { //m
                c.drawRect(540f, 935f, 675f, 1000f, pa)
            } else if (edificio.equals("A") || edificio.equals("a")) { //a
                c.drawRect(670f, 915f, 800f, 980f, pa)
            } else if (edificio.equals("A'") || edificio.equals("a'")) { //a'
                c.drawRect(765f, 915f, 830f, 980f, pa)
            } else if (edificio.equals("G'") || edificio.equals("g'")) { //g'
                c.drawRect(743f, 850f, 835f, 915f, pa)
            } else if (edificio.equals("G") || edificio.equals("g")) { //g
                c.drawRect(630f, 850f, 743f, 915f, pa)
            } else if (edificio.equals("Q") || edificio.equals("q")) { //q
                c.drawRect(630f, 795f, 743f, 855f, pa)
            } else if (edificio.equals("EE") || edificio.equals("ee")) { //ee
                c.drawRect(552f, 845f, 620f, 905f, pa)
            } else if (edificio.equals("P") || edificio.equals("p")) { //p
                c.drawRect(440f, 875f, 570f, 935f, pa)
            } else if (edificio.equals("P'") || edificio.equals("p'")) { //p'
                c.drawRect(385f, 883f, 455f, 935f, pa)
            } else if (edificio.equals("B'") || edificio.equals("b'")) { //b'
                c.drawRect(255f, 780f, 440f, 880f, pa)
            } else if (edificio.equals("B") || edificio.equals("b")) { //b
                c.drawRect(435f, 810f, 550f, 877f, pa)
            } else if (edificio.equals("BG") || edificio.equals("bg")) { //bg
                c.drawRect(565f, 685f, 625f, 795f, pa)
            } else if (edificio.equals("VP") || edificio.equals("vp")) { //vp
                c.drawRect(450f, 620f, 525f, 720f, pa)
            } else if (edificio.equals("cancha 4") || edificio.equals("cancha de futbol 4") || edificio.equals(
                    "cancha de fútbol 4"
                ) || edificio.equals("fb-4") || edificio.equals("FB-4")
            ) { //vp
                c.drawRect(290f, 540f, 425f, 720f, pa)
            } else if (edificio.equals("UM-1,2") || edificio.equals("um-1,2") || edificio.equals("canchas de básquetbol") || edificio.equals(
                    "básquetbol"
                ) || edificio.equals("basquetbol") || edificio.equals("basquet") || edificio.equals(
                    "canchas de basquetbol"
                )
            ) { //vp
                c.drawRect(425f, 520f, 555f, 640f, pa)
            } else if (edificio.equals("DP") || edificio.equals("dp") || edificio.equals("domo") || edificio.equals(
                    "DOMO"
                )
            ) { //vp
                c.drawRect(385f, 370f, 595f, 530f, pa)
            } else if (edificio.equals("INV") || edificio.equals("inv") || edificio.equals("invernadero") || edificio.equals(
                    "INVERNADERO"
                )
            ) { //vp
                c.drawRect(100f, 300f, 220f, 440f, pa)
            } else if (edificio.equals("cancha 1") || edificio.equals("cancha de futbol 1") || edificio.equals(
                    "cancha de fútbol 1"
                ) || edificio.equals("fb-1") || edificio.equals("FB-1")
            ) { //vp
                c.drawRect(600f, 410f, 805f, 710f, pa)
            } else if (edificio.equals("cancha 2") || edificio.equals("cancha de futbol 2") || edificio.equals(
                    "cancha de fútbol 2"
                ) || edificio.equals("fb-2") || edificio.equals("FB-2")
            ) { //vp
                c.drawRect(775f, 410f, 985f, 710f, pa)
            } else if (edificio.equals("cancha 3") || edificio.equals("cancha de futbol 3") || edificio.equals(
                    "cancha de fútbol 3"
                ) || edificio.equals("fb-3") || edificio.equals("FB-3")
            ) { //vp
                c.drawRect(775f, 50f, 995f, 370f, pa)
            } else if (edificio.equals("BB-1") || edificio.equals("bb-1") || edificio.equals("cancha de béisbol") || edificio.equals(
                    "cancha de beisbol"
                ) || edificio.equals("béisbol") || edificio.equals("beisbol")
            ) { //vp
                c.drawRect(450f, 30f, 755f, 355f, pa)
            } else if (edificio.equals("ENTRADA") || edificio.equals("entrada")) { //vp
                c.drawRect(500f, 1560f, 590f, 1635f, pa)
            }
        } else {
            //POSICIÓN DEL PUNTITO DEPENDE DE LA UBICACIÓN
            //si edificio está vacío, significa que hay que detectar la posición
            //Toast.makeText(puntero, "hola", Toast.LENGTH_LONG).show()
            if (puntero.latitud != 0.0) {
                pa.style = Paint.Style.FILL
                pa.color = Color.YELLOW
                if (puntero.latitud >= 21.477783 && puntero.latitud <= 21.477785) { //ud 21.47778363,-104.8658547
                    if (puntero.longitud >= -104.8918 && puntero.longitud <= -104.8917) {
                        ud = true
                        c.drawCircle(650f, 1330f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.477603 && puntero.latitud <= 21.477606) { //cb 21.47760497,-104.86682056
                    if (puntero.longitud >= -104.8668204 && puntero.longitud <= -104.8668207) {
                        cb = true
                        c.drawCircle(415f, 1460f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.4779343 && puntero.latitud <= 21.4779346) { //lc 21.47793448,-104.8669972
                    if (puntero.longitud >= -104.86698 && puntero.longitud <= -104.8670) {
                        lc = true
                        c.drawCircle(375f, 1395f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478290 && puntero.latitud <= 21.478292) { //uvp 21.47829050,-104.86781943
                    if (puntero.longitud >= -104.8678193 && puntero.longitud <= -104.8678196) {
                        uvp = true
                        c.drawCircle(185f, 1410f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478627 && puntero.latitud <= 21.478629) { //liia 21.47862811,-194.86752945
                    if (puntero.longitud >= -104.8675293 && puntero.longitud <= -104.8675296) {
                        liia = true
                        c.drawCircle(170f, 1280f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478715 && puntero.latitud <= 21.478718) { //s 21.47871621,-104.8662526
                    if (puntero.longitud >= -104.86624 && puntero.longitud <= -104.86627) {
                        s = true
                        c.drawCircle(475f, 1160f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.47874 && puntero.latitud <= 21.47877) { //f 21.478751, -104.86680208
                    if (puntero.longitud >= -104.866801 && puntero.longitud <= -104.866803) {
                        f = true
                        c.drawCircle(340f, 1160f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.47894 && puntero.latitud <= 21.47897) { //k 21.4789578,-104.8662385
                    if (puntero.longitud >= -104.86622 && puntero.longitud <= -104.86625) {
                        k = true
                        c.drawCircle(445f, 1110f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.47860 && puntero.latitud <= 21.47863) { //ad 21.478618, -104.86559759
                    if (puntero.longitud >= -104.865596 && puntero.longitud <= -104.865599) {
                        ad = true
                        c.drawCircle(620f, 1135f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478637 && puntero.latitud <= 21.47864) { //ci 21.478639,-104.86553134
                    if (puntero.longitud >= -104.8918 && puntero.longitud <= -104.8917) {
                        ci = true
                        c.drawCircle(700f, 1105f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478477 && puntero.latitud <= 21.478479) { //ta 21.47847880, -104.86485705
                    if (puntero.longitud >= -104.864856 && puntero.longitud <= -104.864859) {
                        ta = true
                        c.drawCircle(850f, 1105f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.47910 && puntero.latitud <= 21.47913) { //j 21.47911, -104.86620506
                if (puntero.longitud >= -104.866204 && puntero.longitud <= -104.866206) {
                    j = true
                    c.drawCircle(440f, 1060f, 15f, pa)
                    //botón de ver información
                    pa.color = Color.rgb(21, 99, 213)
                    c.drawRect(390f, 1675f, 820f, 1790f, pa)
                    pa.color = Color.WHITE
                    c.drawText("Ver información", 440f, 1748f, pa)
                    invalidate()
                } else {
                    invalidate()
                }
            } else if (puntero.latitud >= 21.479020 && puntero.latitud <= 21.479022) { //l 21.47902186, -104.8662706
                    if (puntero.longitud >= -104.86626 && puntero.longitud <= -104.86628) {
                        l = true
                        c.drawCircle(555f, 1050f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478903 && puntero.latitud <= 21.478906) { //x 21.47890446,-104.86502431
                    if (puntero.longitud >= -104.865023 && puntero.longitud <= -104.865026) {
                        x = true
                        c.drawCircle(715f, 1030f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.47876 && puntero.latitud <= 21.47878) { //n 21.4787795,-104.86467400
                    if (puntero.longitud >= -104.864672 && puntero.longitud <= -104.864676) {
                        n = true
                        c.drawCircle(820f, 1030f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.478793 && puntero.latitud <= 21.478797) { //h 21.47879500,-104.86467400
                    if (puntero.longitud >= -104.864673 && puntero.longitud <= -104.864675) {
                        h = true
                        c.drawCircle(450f, 1000f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.479284 && puntero.latitud <= 21.479286) { //m 21.47928535,-104.86548136
                    if (puntero.longitud >= -104.865480 && puntero.longitud <= -104.865483) {
                        m = true
                        c.drawCircle(600f, 975f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.479155 && puntero.latitud <= 21.479157) { //a 21.47915638,-104.86493806
                    if (puntero.longitud >= -104.864937 && puntero.longitud <= -104.864939) {
                        a = true
                        c.drawCircle(740f, 940f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.479447 && puntero.latitud <= 21.479449) { //licbi 21.47944801,-104.8669601
                    if (puntero.longitud >= -104.86695 && puntero.longitud <= -104.86697) {
                        licbi = true
                        c.drawCircle(210f, 1000f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.479631 && puntero.latitud <= 21.479633) { //p'
                    if (puntero.longitud >= -104.895 && puntero.longitud <= -104.897) {
                        p2 = true
                        c.drawCircle(430f, 920f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.479487 && puntero.latitud <= 21.479489) { //p
                    if (puntero.longitud >= -104.865778 && puntero.longitud <= -104.86578) {
                        p = true
                        c.drawCircle(500f, 900f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.47956 && puntero.latitud <= 21.47958) { //ee
                    if (puntero.longitud >= -104.865506 && puntero.longitud <= -104.865508) {
                        ee = true
                        c.drawCircle(600f, 890f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                } else if (puntero.latitud >= 21.479260 && puntero.latitud <= 21.479262) { //g
                    if (puntero.longitud >= -104.865191 && puntero.longitud <= -104.865193) {
                        g = true
                        c.drawCircle(680f, 900f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.47925 && puntero.latitud <= 21.47927) { //g'
                    if (puntero.longitud >= -104.864856&& puntero.longitud <= -104.864858) {
                        g2 = true
                        c.drawCircle(830f, 900f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.47980 && puntero.latitud <= 21.47983) { //b'
                    if (puntero.longitud >= -104.865953 && puntero.longitud <= -104.865955) {
                        b2 = true
                        c.drawCircle(300f, 850f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.479672 && puntero.latitud <= 21.479674) { //b
                    if (puntero.longitud >= -104.865756 && puntero.longitud <= -104.865757) {
                        b = true
                        c.drawCircle(490f, 850f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
                else if (puntero.latitud >= 21.479577 && puntero.latitud <= 21.47958) { //q
                    if (puntero.longitud >= -104.865202 && puntero.longitud <= -104.865204) {
                        q = true
                        c.drawCircle(650f, 840f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }else if (puntero.latitud >= 21.4837 && puntero.latitud <= 21.4839) { //bg
                    if (puntero.longitud >= -104.8918 && puntero.longitud <= -104.8917) {
                        bg = true
                        c.drawCircle(580f, 740f, 15f, pa)
                        //botón de ver información
                        pa.color = Color.rgb(21, 99, 213)
                        c.drawRect(390f, 1675f, 820f, 1790f, pa)
                        pa.color = Color.WHITE
                        c.drawText("Ver información", 440f, 1748f, pa)
                        invalidate()
                    } else {
                        invalidate()
                    }
                }
            }else {
                    //repetir hasta que latitud sea diferente que 0.0 (que cargue la latitud y longitud)
                    invalidate()
                }

            }
    }


        override fun onTouchEvent(e: MotionEvent): Boolean {
            when (e.action) {
                MotionEvent.ACTION_DOWN -> {
                    //tocar boton de buscar
                    var btoqueX = e.getX()
                    var btoqueY = e.getY()
                    var bx = 50f
                    var by = 1675f
                    var bx2 = 370f
                    var by2 = 1790f
                    edificio = ""

                    var etEdificio = EditText(puntero)
                    if (btoqueX >= bx && btoqueX <= bx2) {
                        if (btoqueY >= by && btoqueY <= by2) {
                            //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                            var alerta = AlertDialog.Builder(puntero)
                            alerta.setTitle("Atención").setMessage("¿A qué edificio quieres ir?")
                                .setView(etEdificio)
                                .setPositiveButton("Buscar") { dialog, which ->
                                    edificio = etEdificio.text.toString()
                                    invalidate()
                                }.setNegativeButton("Cancelar") { dialog, which ->
                                    return@setNegativeButton
                                }.show()
                        }
                    }
                    //tocar boton de ver informacion
                    if (ud) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        ud = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio unidad departamental (UD) se encuentran las oficinas de algunos departamentos de distintas carreras del ITT, así como algunas aulas de clase.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (cb) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        cb = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio de ciencias Básicas (CB) se encuentran las oficinas y aulas de clase para las materias de este departamento.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (lc) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        lc = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el laboratorio de cómputo (LC) hay salas de clase con computadoras para materias que las requieran, comúnmente para las carreras ISC y ITIC's.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (uvp) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        uvp = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio UVP se encuentran las oficionas de vinculación y posgrado, así como algunas aulas de clase.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (liia) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        liia = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio LIIA se encuentran aulas de clase para las diferentes maestrías que ofrece el ITT.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (s) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        s = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio S se encuentran las oficinas del comité estudiantil del ITT.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (f) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        f = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("El edificio F se utiliza como taller de eléctrica y es utilizado por los estudiantes que lo requieran.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (k) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        k = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio K se encuentran las oficinas del sindicato, la cafetería y un aula de clases.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (ad) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        ad = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio de administración (AD) se encuentran las oficinas de servicios escolares, coordinación, financieros y dirección.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (ci) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        ci = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio CI se encuentra la biblioteca del ITT que cuenta  también con diferentes espacios de trabajo y aulas para los estudiantes.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (ta) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        ta = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("El edificio TA se utiliza como taller de arquitectura para los alumnos de esta carrera, cuenta con aulas de clase con destiladores.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (j) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        j = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio J se encuentra la papelería y aulas de clase que comúnmente son utilizadas por las carreras de mecatrónica y eléctrica.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (x) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        x = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio X se encuentran algunas aulas de clase para distintas carreras.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (n) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        n = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio N se encuentran algunas aulas de clase que se utilizan comúnmente para las carreras de administración y gestión empresarial.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (h) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        h = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio H se encuentran algunas aulas de clase que cuentan con destiladores utilizadas por la carrera de arquitectura.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (m) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        m = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio M se encuentran algunos laboratorios de química.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (a) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        a = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("El edificio A cuenta con aulas de clase comúnmente utilizadas por la carrera de arquitectura.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (a2) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        a2 = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio A' cuenta con aulas de clase comúnmente utilizadas por la carrera de arquitectura.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (licbi) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        licbi = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("El edificio LICBI cuenta con aulas de clase y salas utilizadas para presentaciones.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (p2) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        p2 = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("Edificio P'.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (p) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        p = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio P se encuentra un auditorio que se utiliza para presentaciones del ITT.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (ee) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        ee = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("Este es el edificio EE.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (g) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        g = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio G se encuentran aulas de clase utilizadas por distintas carreras del ITT.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (g2) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        g2 = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio G' se encuentran algunos laboratorios de química.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (b2) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        b2 = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("Este es el edificio B'.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (b) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        b = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("Este es el edificio B.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (q) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        q = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("En el edificio Q se encuentran aulas de clase utilizadas comúnmente por las carreras de química y bioquímica.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    } else if (bg) {
                        var itoqueX = e.getX()
                        var itoqueY = e.getY()
                        var ix = 390f
                        var iy = 1675f
                        var ix2 = 820f
                        var iy2 = 1790f
                        bg = false

                        if (itoqueX >= ix && itoqueX <= ix2) {
                            if (itoqueY >= iy && itoqueY <= iy2) {
                                //Toast.makeText(puntero, "Tocaste botón!", Toast.LENGTH_LONG).show()
                                var alerta = AlertDialog.Builder(puntero)
                                alerta.setTitle("Información")
                                    .setMessage("Este es el edificio BG.")
                                    .setPositiveButton("Aceptar") { dialog, which ->
                                        return@setPositiveButton
                                    }.show()
                            }
                        }
                    }
                }
            }
            return true

        }
}
