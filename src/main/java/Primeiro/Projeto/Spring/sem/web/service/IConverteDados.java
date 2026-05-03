package Primeiro.Projeto.Spring.sem.web.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
