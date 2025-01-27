# Cadastro de Aluno

Funcionalidades principais:
Cadastro e Edição de Alunos:

Permite inserir ou editar dados de um aluno, como nome, RA e endereço.
A edição é realizada com base no ID do aluno, se fornecido.
Busca Automática de Endereço pelo CEP:

Ao inserir o CEP, o aplicativo faz uma consulta via API (ViaCep) e preenche automaticamente os campos de endereço, como logradouro, bairro, cidade e estado.
Integração com APIs:

Utiliza a ViaCepService para buscar dados de endereço baseado no CEP.
Utiliza o AlunoService para inserir ou atualizar os dados do aluno no sistema.
Exibição de Dados Existentes:

Se o aplicativo estiver no modo de edição (ao fornecer um ID), ele preenche os campos com os dados do aluno já cadastrados.
Salvamento de Dados:

Ao clicar no botão "Salvar", o aplicativo envia os dados para a API para criar ou atualizar o cadastro do aluno.
Interface e Layout:

O layout permite a inserção de dados em campos de texto e exibe notificações de sucesso ou erro após as operações.
