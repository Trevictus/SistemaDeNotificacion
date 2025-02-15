class MensajeTexto: Notificable {
    override fun enviarNotificacion(): String {
        return "SMS enviado."
    }
}