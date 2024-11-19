package com.example.ac2_cadastro_alunos.services;

import com.example.ac2_cadastro_alunos.utils.ViaCep;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ViaCepService {
    @GET("{cep}/json")
    Call<ViaCep> get(@Path("cep") String cep);
}