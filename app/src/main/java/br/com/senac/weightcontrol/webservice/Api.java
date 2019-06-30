package br.com.senac.weightcontrol.webservice;

public class Api {
    private static final String ROOT_URL = "https://sitezasso.000webhostapp.com/weightcontrolapp/v1/Api.php?apicall=";

    public static final String URL_CREATE_WEIGHTAPP = ROOT_URL + "createweightcontrol";
    public static final String URL_READ_WEIGHTAPP= ROOT_URL + "getweightcontrol";
    public static final String URL_UPDATE_WEIGHTAPP= ROOT_URL + "updateweightcontrol";
    public static final String URL_DELETE_WEIGHTAPP = ROOT_URL + "deleteweightcontrol&id=";
}
