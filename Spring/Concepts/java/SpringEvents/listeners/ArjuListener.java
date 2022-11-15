package SpringEvents.listeners;

import SpringEvents.shows.BreakingBad;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ArjuListener {
    public void listeningBreakingBad(String episodeNo){
        System.out.println("Arju watching Breaking Bad : "+episodeNo);
    }

    @EventListener
    public void listeningBB(BreakingBad breakingBad){
        listeningBreakingBad(breakingBad.getEpisodeNo());

    }
}