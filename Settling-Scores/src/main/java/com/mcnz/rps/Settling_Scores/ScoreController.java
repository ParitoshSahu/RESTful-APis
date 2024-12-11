package com.mcnz.rps.Settling_Scores;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ScoreController {

    static Score score = new Score(30,20,10);

    @PutMapping("/score")
    public Score replaceScore(@RequestBody Score newScore) {
        score = newScore;
        return score;
    }

    @DeleteMapping("/score")
    public void deleteScore () {
        score = null;
    }

    @PatchMapping("/score/wins")
    public Score updateWins(@RequestParam(name="new-value") int newValue) {
        score.wins = newValue;
        return score;
    }

    @GetMapping("/health-check")
    public String getHealthCheck(){
        return "Situation Normal All Fired Up!";
    }

    @PostMapping("/score/wins")
    public Score increaseWins() {
        score.wins++;
        return score;
    }

    @PostMapping("/score/losses")
    public Score increaseLosses() {
        score.losses++;
        return score;
    }

    @PostMapping("/score/ties")
    public Score increaseTies() {
        score.ties++;
        return score;
    }

    @GetMapping("/score")
    public Score getScore() {
        return score;
    }

    @GetMapping("/score/{winslossesorties}")
    public int getWinsLossesOrTies(@PathVariable String winslossesorties) {
        if (winslossesorties.equalsIgnoreCase("wins")) {
            return score.wins;
        }
        if (winslossesorties.equalsIgnoreCase("ties")) {
            return score.ties;
        }
        return score.losses;
    }
//    THE SAME CODE IS IMPLEMENTED ABOUT USING A SINGLE VARIABLE & @PathVariable ANNOTATION
//    @GetMapping("/score/wins")
//    public int getWins() { return  score.wins; }
//
//    @GetMapping("/score/losses")
//    public int getLosses() { return  score.losses; }
//
//    @GetMapping("/score/ties")
//    public int getTies() { return  score.ties; }

}
