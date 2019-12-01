package mx.edu.ittepic.tpdm_u4u5_practica2_15401020

import android.location.Location
import android.location.LocationListener
import android.os.Bundle

class OyenteGPS(p:MainActivity): LocationListener {
    var puntero = p
    override fun onLocationChanged(location: Location) {
        puntero.latitud = location.latitude
        puntero.longitud = location.longitude
        puntero.setTitle("${puntero.latitud},${puntero.longitud}")
    }

    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
        //pendiente
    }

    override fun onProviderDisabled(provider: String?) {
       //pendiente
    }

    override fun onProviderEnabled(provider: String?) {
       //pendiente
    }


}