# *Resumo do aplicativo Mobile*
O aplicativo desenvolvido é uma simples contagem de pontos, onde o usuário pode incrementar ou decrementar uma pontuação através de botões em três telas distintas. A classificação é compartilhada entre essas telas, permitindo que o usuário navegue entre elas e mantenha o controle da pontuação de forma contínua. O aplicativo utiliza a navegação entre atividades do Android, passando valores através de Intent para garantir que a pontuação seja preservada em todas as telas.

# *Estrutura do Código*
# Main :
Contém a lógica inicial do aplicativo.
Recebe um valor de classificação através do Intente o exibe em um TextView.
Possui botões para incrementar ( mais) e decrementar ( menos) a pontuação, além de um botão para avançar para a próxima tela ( Tela2).

# Tela2 :
Semelhante a MainActivity, esta tela também produz a pontuação recebida e permite ao usuário ajustar a pontuação.
Inclui botões para navegar de volta MainActivitye para avançar para Tela3.

# Tela3 :
Mantém a mesma lógica das telas anteriores, exibindo e permitindo a manipulação da avaliação.
Permite que o usuário volte para Tela2.

# *Layout XML*
O layout de cada atividade é definido usando arquivos XML, onde a interface do usuário é criada com TextViewpara exibir a pontuação e Buttonpara as interações do usuário.
As interfaces utilizam o ConstraintLayoutpara organizar os elementos na tela, utilizando as diretrizes ( Guideline) para alinhar e posicionar os componentes de forma responsiva.

# *Funcionalidades*
Atualização de Pontuação : O usuário pode aumentar ou diminuir a pontuação clicando nos botões.

Navegação Entre Telas : As atividades são interconectadas, permitindo que o usuário navegue entre as telas mantendo o estado da pontuação.

Passagem de Dados : A pontuação é passada de uma tela para outra usando Intente métodos como putExtra, garantindo que o valor da pontuação permaneça consistente em toda a aplicação.
Esse aplicativo demonstra princípios fundamentais de desenvolvimento Android, como a manipulação de Intents, a atualização de TextViews, e a criação de interfaces de usuário com XML.

![Captura de tela 2024-10-03 134636](https://github.com/user-attachments/assets/5dfc864f-f817-4932-9606-fbc1fcb03281)
![Captura de tela 2024-10-03 134702](https://github.com/user-attachments/assets/f0512317-61f1-4e4e-8164-c948ca57d4e2)
