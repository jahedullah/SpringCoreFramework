package SpringEvents.listeners;

import SpringEvents.shows.BreakingBad;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FarabiListener {
    public void listeningBreakingBad(String episodeNo){
        System.out.println("Farabi watching Breaking Bad : "+episodeNo);
    }

    @EventListener
    public void listeningBB(BreakingBad breakingBad){
        listeningBreakingBad(breakingBad.getEpisodeNo());

    }
}