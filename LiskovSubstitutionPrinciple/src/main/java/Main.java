import bad.Member;
import good.TournamentJoiner;
import good.TournamentOrganizer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nApproach that doesn't follow LSP:\n");

        List<Member> members1 = List.of(
            new bad.PremiumMember("Jack Hores"),
            new bad.VipMember("Tom Johns"),
            new bad.FreeMember("Martin Vilop")
        );

        // 이 코드는 리스코프 치환 원칙에 맞지 않습니다. 무료 회원은 토너먼트를 주최할 수 없습니다.
        for (Member member : members1) {
            member.organizeTournament();
        }

        System.out.println("\nApproach that follow LSP:\n");

        List<TournamentJoiner> members2 = List.of(
            new good.PremiumMember("Jack Hores"),
            new good.VipMember("Tom Johns"),
            new good.FreeMember("Martin Vilop")
        );

        // 이 코드는 리스코프 치환 원칙을 준수한다.
        for (TournamentJoiner member : members2) {
            member.joinTournament();
        }

        List<TournamentOrganizer> members3 = List.of(
            new good.PremiumMember("Jack Hores"),
            new good.VipMember("Tom Johns")
        );

        // 이 코드는 리스코프 치환 원칙을 준수한다.
        for (TournamentOrganizer member : members3) {
            member.organizeTournament();
        }
    }
}
