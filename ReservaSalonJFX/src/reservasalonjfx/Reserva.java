/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasalonjfx;

import java.time.LocalDate;

/**
 *
 * @author stx
 */
public class Reserva {

    private String nombre;
    private int telefono;
    private String email;
    private LocalDate fechaEvento;
    private String tipoEvento;
    private int asistentes;
    private String seleccionComida;
    private int dias;
    private int habitaciones;

    public Reserva() {
    }

    public Reserva(String nombre, int telefono, String email, LocalDate fechaEvento, String tipoEvento, int asistentes, String seleccionComida, int dias, int habitaciones) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaEvento = fechaEvento;
        this.tipoEvento = tipoEvento;
        this.asistentes = asistentes;
        this.seleccionComida = seleccionComida;
        this.dias = dias;
        this.habitaciones = habitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }

    public String getSeleccionComida() {
        return seleccionComida;
    }

    public void setSeleccionComida(String seleccionComida) {
        this.seleccionComida = seleccionComida;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", fechaEvento=" + fechaEvento + ", tipoEvento=" + tipoEvento + ", asistentes=" + asistentes + ", seleccionComida=" + seleccionComida + ", dias=" + dias + ", habitaciones=" + habitaciones + '}';
    }

}
