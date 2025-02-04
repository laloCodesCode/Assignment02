package CSC340.AssignmentTwo;

import CSC340.AssignmentTwo.MusicTrack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private static final String DEEZER_API_URL = "https://api.deezer.com/search?q=Bad+Bunny";

    @GetMapping("/badbunny")
    public MusicTrack[] getBadBunnyTracks() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(DEEZER_API_URL, MusicTrack[].class);
    }
}
