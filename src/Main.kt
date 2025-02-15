fun main(){
    val notificaciones: List<Notificable> = listOf(CorreoElectronico(), MensajeTexto(),NotificacionPush())

    for(elemento in notificaciones){
        println(elemento.enviarNotificacion())
    }

}