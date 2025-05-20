package org.example.repository;

public interface AutorizadorReembolso {
    boolean isAutorizado(String paciente, double valor);
}