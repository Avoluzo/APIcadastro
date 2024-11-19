package com.example.ac2_cadastro_alunos.api;

import com.example.ac2_cadastro_alunos.services.AlunoService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlunoMockApi {
    private static final String BASE_URL = "https://673bca3f96b8dcd5f3f77a40.mockapi.io/aluno/v1/:alunos";
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit == null) retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    public static AlunoService getAlunoService() {
        return getClient().create(AlunoService.class);
    }
}
