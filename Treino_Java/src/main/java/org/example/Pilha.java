package org.example;

public class Pilha {
    private int [] elementos;
    private int topo;

    public Pilha(int n){
        elementos = new int[n];
        topo = -1; //posição inválida
    }
    public void push(int elemento){
        if(isFull()){
            System.out.println("Pilha cheia, Remova elementos para adicionar mais");
        }else {
            elementos[++topo] = elemento;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Pilha vazia, não há oque remover!!");
            return -1;
        }else{
            return elementos[topo--];
        }
    }

    public boolean isEmpty(){
        return (topo == -1);
    }
    public boolean isFull(){
        return (topo == elementos.length-1);
    }
    public int size(){
        return topo + 1;
    }
    public void print(){
        for(int i = topo; i >= 0; i--){
            System.out.println(elementos[i] + " ");
        }
    }
}

class main {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        p.push(1);
        p.push(12);
        p.push(4);
        p.push(46);
        System.out.println("---------------- pilha sem remoções --------------------");
        p.print();
        System.out.println("---------------- itens removidos --------------------");
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println("---------------- elementos --------------------");
        p.print();
        System.out.println("---------------- tamanho da pilha --------------------");
        System.out.println(p.size());

        p.push(5);
        p.push(5);
        p.push(8);
        System.out.println("---------------- teste se está cheia -------------------");
        System.out.println(p.isFull());
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        System.out.println("---------------- teste se está vazia -------------------");
        System.out.println(p.isEmpty());


    }
}
