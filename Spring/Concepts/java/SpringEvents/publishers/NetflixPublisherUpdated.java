package SpringEvents.publishers;

import SpringEvents.shows.BreakingBad;
import SpringEvents.shows.TheGameOfThrones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class NetflixPublisherUpdated {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    public void streamGameOfThrones(String episodeNo){
        System.out.println("NetFlix : Streaming Game of Thrones : Episode " + episodeNo);
        applicationEventPublisher.publishEvent(new TheGameOfThrones(episodeNo));
    }
    public void BreakingBad(String episodeNo){
        System.out.println("NetFlix : Streaming Breaking Bad : Episode "+episodeNo);
        applicationEventPublisher.publishEvent(new BreakingBad(episodeNo));
    }
}
