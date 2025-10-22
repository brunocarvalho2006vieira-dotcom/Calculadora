
import java.util.*;
import java.lang.*;
import java.io.*;

    public class Main{
       
        public static void main(String[] args) {
          	    
            int calc=0;
            String nome;
            	    
            //ativação para preenchimento de variaveis
            Scanner leia = new Scanner(System.in);
            
            //abertura da aplicação
            System.out.print("\nQual o seu nome? ");
            nome=leia.nextLine();
            
            while(calc!=3){
                
                System.out.println("\n\n===Calculadoras disponivéis===");
                System.out.println("(1)-Calculadora simples");
                System.out.println("(2)-Calculadora de polígonos");
                System.out.println("(3)-Sair");
                System.out.print("\nQual selecione uma opção? ");
                calc=leia.nextInt();
                
                if(calc>3){
                    System.out.println("\n===============Erro===============");
                    System.out.print("\nOppção invalida,\nselecione os números apresentados!!!");
                }
                
                if(calc==1){
                    int op=0;
                    double n1,n2,ttl;
                    try{        
                        while(op!=7){
                           
                            System.out.print("\n\n===Calculadora simples===\n");
                           
                            System.out.println("Operações disponivéis\n");
                            System.out.println("(1)-Soma");
                            System.out.println("(2)-Subtração");
                            System.out.println("(3)-Multiplicação");
                            System.out.println("(4)-Divisão");
                            System.out.println("(5)-Potência");
                            System.out.println("(6)-Raiz");  
                            System.out.println("(7)-Sair");
                            System.out.print("\nDe (1) a (7) \nEscolha sua opção: ");
                            op=leia.nextInt();
                            
                            if(op>7){
                                System.out.println("\n===============Erro===============");
                                System.out.print("\nOppção invalida,\nselecione os números apresentados!!!");
                            }
                           
                            switch(op){
                               
                                //soma    
                                case 1:
                                System.out.print("\n\n=====Soma=====\n");
                                System.out.print("Digite o 1º nº: ");
                                n1=leia.nextDouble();
                                System.out.print("Digite o 2º nº: ");
                                n2=leia.nextDouble();
                                ttl=n1+n2;
                                System.out.println("Resultado: "+ttl+" "+nome+"!!");
                                break;
                                
                                //subtração  
                                case 2:
                                System.out.print("\n\n=====Subtração=====\n");
                                System.out.print("Digite o 1º nº: ");
                                n1=leia.nextDouble();
                                System.out.print("Digite o 2º nº: ");
                                n2=leia.nextDouble();
                                ttl=n1-n2;
                                System.out.println("Resultado é "+ttl+" "+nome+"!!");
                                
                                break;
                                
                                //multiplicação  
                                case 3:
                                System.out.print("\n\n=====multiplicação=====\n");
                                System.out.print("Digite o 1º nº: ");
                                n1=leia.nextDouble();
                                System.out.print("Digite o 2º nº: ");
                                n2=leia.nextDouble();
                                ttl=n1*n2;
                                System.out.print("Resultado é "+ttl+" "+nome+"!!");
                                break;
                                
                                //divisão  
                                case 4:
                                System.out.print("\n\n=====Divisã=====\n");
                                System.out.print("Digite o 1º nº: ");
                                n1=leia.nextDouble();
                                System.out.print("Digite o 2º nº: ");
                                n2=leia.nextDouble();
                                if(n2==0){
                                    System.out.print("Erro: não existe divisão por 0 !!");
                                }
                                else{
                                    ttl=n1/n2;
                                    System.out.print("Resultado é "+ttl+" "+nome+"!!");
                                }
                                break;
                                
                                //exponenciação   
                                case 5:
                                System.out.print("\n\n=====Exponenciação=====\n");
                                System.out.print("Digite sua base: ");
                                n1=leia.nextDouble();
                                System.out.print("Digite seu expoente:");
                                n2=leia.nextDouble();
                                ttl=Math.pow(n1,n2);
                                System.out.print("Resultado é "+ttl+" "+nome+"!!");
                                break;
                                
                                //radiciação  
                                case 6:
                                System.out.print("\n\n=====Radiciação=====\n");
                                System.out.print("Digeite o radicando da raiz: ");
                                n1=leia.nextDouble();
                                System.out.print("Digite o índice da raiz: ");
                                n2=leia.nextDouble();
                                ttl=Math.pow(n1,1/n2);
                                System.out.print("Resultado é "+ttl+" "+nome+"!!");
                                break;
                            }
                        }
                    }
                    //tratativa de erro (letra em variavel de numero)
                    catch(InputMismatchException exception){
                        System.out.print("Erro, "+nome+" por favor coloque somente números!!!");
                    }
                }
                
                else if(calc==2){
                    
                    try{
                        int opp=0,saida=0,indice=2;
                        double altura,base,raio,basemaior,ttlp,ttla,cat1,cat2,somacat,hipo,ttl1;
                        
                        while(opp!=6){
                            
                            System.out.print("\n\n===Calculadora de polígonos===\n");
                            
                            System.out.println("Polígonos disponivéis\n");
                            System.out.println("(1)-Quadrado");
                            System.out.println("(2)-Triângulo");
                            System.out.println("(3)-Circulo");
                            System.out.println("(4)-Trapézio isósceles");
                            System.out.println("(5)-Retangulo");
                            System.out.println("(6)-Sair");
                            System.out.print("\nSelecione uma opção? ");
                            opp=leia.nextInt();
                            
                            if(opp>6){
                                System.out.println("\n===============Erro===============");
                                System.out.print("\nOppção invalida,\nselecione os números apresentados!!!");
                            }
                           
                            switch(opp){
                                //Quadrado
                                case 1:
                                System.out.print("\n\n=====Quadrado=====\n");
                                System.out.println("(1)-Seguir");
                                System.out.println("(2)-Sair");
                                System.out.print("\nSelecione uma opção? ");
                                saida=leia.nextInt();
                                if(saida!=2){
                                    System.out.print("\nDigite o valor de um dos lados: ");
                                    base=leia.nextDouble();
                                    ttlp=base*4;
                                    ttla=Math.pow(base,2);
                                    System.out.println(nome+" o perímetro desse quadrado é de "+ttlp+" m");
                                    System.out.println(nome+" o área desse quadrado é de "+ttla+" m²");
                                }
                                break;
                                
                                //Triângulo
                                case 2:
                                System.out.print("\n\n===Triângulo Equilátero===\n");
                                System.out.println("(1)-Seguir");
                                System.out.println("(2)-Sair");
                                System.out.print("\nSelecione uma opção? ");
                                saida=leia.nextInt();
                                if(saida!=2){
                                    System.out.print("\nDigite o valor de um dos lados: ");
                                    base=leia.nextDouble();
                                    System.out.print("\nDigite o valor da altura: ");
                                    altura=leia.nextDouble();
                                    ttlp=base*3;
                                    ttla=(base*altura)/2;
                                    System.out.println(nome+" o perímetro desse triângulo é de "+ttlp+" m");
                                    System.out.println(nome+" o área desse triângulo é de "+ttla+" m²");
                                }
                                break;
                                
                                //Círculo
                                case 3:
                                System.out.print("\n\n=====Circulo=====\n");
                                System.out.println("(1)-Seguir");
                                System.out.println("(2)-Sair");
                                System.out.print("\nSelecione uma opção? ");
                                saida=leia.nextInt();
                                if(saida!=2){
                                    System.out.print("\nDigite o valor do raio: ");
                                    raio=leia.nextDouble();
                                    ttlp=2*Math.PI*raio;
                                    ttla=Math.pow(Math.PI*raio,2);
                                    System.out.println(nome+" o perímetro desse circulo é de "+ttlp+" m");
                                    System.out.println(nome+" o área desse circulo é de "+ttla+" m²");
                                }
                                break;
                                
                                //Trapézio
                                case 4:
                                System.out.print("\n\n=====Trapézio isósceles=====\n");
                                System.out.println("(1)-Seguir");
                                System.out.println("(2)-Sair");
                                System.out.print("\nSelecione uma opção: ");
                                saida=leia.nextInt();
                                if(saida!=2){
                                    System.out.print("\nDigite o valor da base menor: ");
                                    base=leia.nextDouble();
                                    System.out.print("\nDigite o valor da base maior: ");
                                    basemaior=leia.nextDouble();
                                    System.out.print("\nDigite a altura: ");
                                    altura=leia.nextDouble();
                                    cat1=(basemaior-base)/2;
                                    somacat=Math.pow(cat1,2)+Math.pow(altura,2);
                                    hipo=Math.pow(somacat,1.0/2.0);
                                    ttlp=(hipo*2)+base+basemaior;
                                    ttl1=(basemaior+base);
                                    ttla=(ttl1*altura)/2;
                                    System.out.println(nome+" o perímetro desse tapezio é de "+ttlp+" m");
                                    System.out.println(nome+" o área desse trapézio é de "+ttla+" m²");
                                }
                                break;
                                
                                //Retângulo
                                case 5:
                                System.out.print("\n\n=====Retângulo=====\n");
                                System.out.println("(1)-Seguir");
                                System.out.println("(2)-Sair");
                                System.out.print("\nSelecione uma opção: ");
                                saida=leia.nextInt();
                                if(saida!=2){
                                    System.out.print("\nDigite o valor da base: ");
                                    base=leia.nextDouble();
                                    System.out.print("\nDigite a altura: ");
                                    altura=leia.nextDouble();
                                    ttlp=base*2+altura*2;
                                    ttla=base*altura;
                                    System.out.println(nome+" o perímetro desse retângulo é de "+ttlp+" m");
                                    System.out.println(nome+" o área desse retângulo é de "+ttla+" m²");
                                }
                                break;
                            }
                        }
                    }
                       
                    //tratativa de erro (letra em variavel de numero) 
                    catch(InputMismatchException exception){
                        System.out.print("Erro, "+nome+" por favor coloque somente números!!!");
                    }
                }
            }   
        }
    }

