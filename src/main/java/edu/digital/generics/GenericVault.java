package edu.digital.generics;

public class GenericVault<T> {

    private T data;

    public GenericVault(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
