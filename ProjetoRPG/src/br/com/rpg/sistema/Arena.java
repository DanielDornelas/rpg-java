package br.com.rpg.sistema;

import br.com.rpg.modelo.Personagem;
import java.util.ArrayList;

public class Arena {

    public static Personagem batalhar(Personagem p1, Personagem p2) {
        System.out.println("⚔️ Batalha entre " + p1.getTipo() + " e " + p2.getTipo());

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            if (!p2.estaVivo()) return p1;

            p2.atacar(p1);
            if (!p1.estaVivo()) return p2;

            p1.exibirStatus();
            p2.exibirStatus();
        }
        return null;
    }

    public static void torneio(ArrayList<Personagem> participantes) {
        if (participantes.size() < 2) {
            System.out.println("Participantes insuficientes!");
            return;
        }

        while (participantes.size() > 1) {
            Personagem p1 = participantes.get(0);
            Personagem p2 = participantes.get(1);

            Personagem vencedor = batalhar(p1, p2);
            participantes.remove(vencedor == p1 ? p2 : p1);

            vencedor.curar(9999);
            System.out.println("🏆 Vencedor da rodada: " + vencedor.getTipo());
        }

        System.out.println("👑 Campeão: " + participantes.get(0).getTipo());
    }
}