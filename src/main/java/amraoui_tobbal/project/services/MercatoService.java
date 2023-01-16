package amraoui_tobbal.project.services;

import amraoui_tobbal.project.entity.Mercato;

public class MercatoService {
    public Mercato myService(Mercato mercato) {
        System.out.println(mercato);
        Mercato ma = new Mercato();
        ma.setSeason(mercato.getSeason() + " SEASON");
        ma.setPlayerName("Mr. " + mercato.getPlayerName());
        ma.setTeamFrom("FROM" + mercato.getTeamFrom());
        ma.setTeamTo("TO" + mercato.getTeamTo());
        ma.setValueTransfer("VALUE" + mercato.getValueTransfer());
        return ma;
    }
}
