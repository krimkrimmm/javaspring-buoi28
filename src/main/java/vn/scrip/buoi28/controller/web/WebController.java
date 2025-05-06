package vn.scrip.buoi28.controller.web;

import vn.scrip.buoi28.entity.Movie;
import vn.scrip.buoi28.entity.User;
import vn.scrip.buoi28.service.FavoriteMovieService;
import vn.scrip.buoi28.service.MovieService;
import vn.scrip.buoi28.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final UserService userService;
    private final MovieService movieService;
    private final FavoriteMovieService favoriteMovieService;

    @PostMapping("/movie/{id}/favorite")
    public String toggleFavorite(@PathVariable Integer id, Principal principal) {
        User user = userService.findByEmail(principal.getName());
        Movie movie = movieService.findById(id);
        favoriteMovieService.toggleFavorite(user, movie);
        return "redirect:/movie/" + id;
    }

    @GetMapping("/user/favorites")
    public String showFavorites(Model model, Principal principal) {
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("favorites", favoriteMovieService.getFavoritesByUser(user));
        return "user/favorites";
    }

    @GetMapping("/user/profile")
    public String showProfile(Model model, Principal principal) {
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("user", user);
        return "user/profile";
    }
}
