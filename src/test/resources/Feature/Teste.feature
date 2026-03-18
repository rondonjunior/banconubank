@tag
 Feature: Abertura 
  
 
  
@formularioaberturadeconta
Scenario: Validacao de formulario de abertura de conta com pessoas do banco
  Given que acesso o banco "https://nubank.com.br/"
  When seleciono o botão Quero ser Nubank
  And preencho o formulario com pessoas vindas do banco de dados
  And seleciono o checkbox de termos de aceite
  Then o botão de continuar deve estar habilitado
  