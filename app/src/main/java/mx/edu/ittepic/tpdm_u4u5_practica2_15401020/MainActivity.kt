package mx.edu.ittepic.tpdm_u4u5_practica2_15401020

import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import java.util.jar.Manifest
import android.Manifest.permission
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.Manifest.permission.RECORD_AUDIO
import android.content.Context
import androidx.core.app.ActivityCompat
import android.location.LocationListener




class MainActivity : AppCompatActivity() {

    var locationManager : LocationManager?=null
    var longitud:Double = 0.0
    var latitud: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(Lienzo(this))

        locationManager = getSystemService(LOCATION_SERVICE) as LocationManager?
        var oyenteGPS = OyenteGPS(this)

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //permiso denegado
            Toast.makeText(this,"Permiso de ubicación denegado, actívalo por favor.",Toast.LENGTH_LONG).show()
            return
        }
        //permiso aprobado
        locationManager?.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0f,oyenteGPS)

    }

}
