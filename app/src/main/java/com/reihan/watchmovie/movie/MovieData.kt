package com.reihan.watchmovie.movie

object MovieData {
    private var data = arrayOf(
        arrayOf(
            "https://upload.wikimedia.org/wikipedia/en/9/9b/Blade_Runner_2049_poster.png",
            "Blade Runner 2049",
            "Sci-Fi, Thriller",
            "1h 57m",
            "2019",
            "Netflix",
            "8,2",
            "Ridley Scott",
            "Ryan Gosling, Harrison Ford, Ana de Armas",
            "Set in a dystopian Los Angeles in 2019, blade runner Rick Deckard is called out of retirement to terminate a quartet of replicants who have escaped to Earth seeking their creator for a way to extend their short life spans. A young blade runner's discovery of a long-buried secret leads him to track down former blade runner Rick Deckard, who's been missing for thirty years.",
        ),
        arrayOf(
            "https://preview.redd.it/omq5onu40tg71.png?width=1638&format=png&auto=webp&s=a3c79798ffb8bdc65183e0116ab5f97dd53620be",
            "Dune",
            "Sci-Fi, Adventure, Fantasy",
            "2h 32m",
            "2021",
            "HBO Max",
            "8.1",
            "Denis Villeneuve",
            "Timothée Chalamet, Rebecca Ferguson, Oscar Isaac",
            "Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
        ),
        arrayOf(
            "https://m.media-amazon.com/images/M/MV5BOTY2NzFjODctOWUzMC00MGZhLTlhNjMtM2Y2ODBiNGY1ZWRiXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_.jpg",
            "Free Guy",
            "Action, Comedy, Sci-Fi",
            "1h 59m",
            "2021",
            "HBO Max",
            "7.3",
            "Shawn Levy",
            "Ryan Reynolds, Jodie Comer, Joe Keery",
            "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.",
        ),
        arrayOf(
            "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_.jpg",
            "Inception",
            "Action, Adventure, Sci-Fi",
            "2h 28m",
            "2010",
            "Netflix",
            "8.8",
            "Christopher Nolan",
            "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page",
            "A thief who steals corporate secrets through use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.",
        ),
        arrayOf(
            "https://play-lh.googleusercontent.com/cp94GJsYWZCrf4bmYp3yZkuN7FAaorxZWh008_DUji0Qj2cfyILd7-h_611zbbiUEkg=w240-h480-rw",
            "Interstellar",
            "Adventure, Drama, Sci-Fi",
            "2h 49m",
            "2014",
            "Netflix",
            "8.6",
            "Christopher Nolan",
            "Matthew McConaughey, Anne Hathaway, Jessica Chastain",
            "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
        ),
        arrayOf(
            "https://m.media-amazon.com/images/I/51SfhEcgpML._AC_UF894,1000_QL80_.jpg",
            "The Martian",
            "Adventure, Drama, Sci-Fi",
            "2h 21m",
            "2015",
            "Netflix",
            "8.0",
            "Ridley Scott",
            "Matt Damon, Jessica Chastain, Kristen Wiig",
            "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive.",
        ),
        arrayOf(
            "https://m.media-amazon.com/images/M/MV5BYjkwNzJmZTItOThkYi00Zjc0LTllMDAtYzQ0MWNhM2UxMGI1XkEyXkFqcGdeQXVyMTA3MDk2NDg2._V1_.jpg",
            "Moonfall",
            "Action, Adventure, Sci-Fi",
            "Durasi: 1h 50m",
            "2021",
            "HBO Max",
            "6.2",
            "Roland Emmerich",
            "Halle Berry, Patrick Wilson, Charlie Plummer",
            "Astronauts on the International Space Station discover an alien artifact that threatens the safety of everyone on Earth.",
        ),
        arrayOf(
            "https://m.media-amazon.com/images/I/91UjyAWXgpL._RI_.jpg",
            "Ready Player One",
            "Action, Adventure, Sci-Fi",
            "Durasi: 2h 20m",
            "2018",
            "Netflix",
            "7.5",
            "Steven Spielberg",
            "Tye Sheridan, Olivia Cooke, Ben Mendelsohn",
            "When the creator of a popular video game system dies, a virtual contest is created to compete for his fortune.",
        ),
        arrayOf(
            "https://musicart.xboxlive.com/7/14815100-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080",
            "Tenet",
            "Action, Sci-Fi, Thriller",
            "2h 30m",
            "2020",
            "HBO Max",
            "7.5",
            "Christopher Nolan",
            "John David Washington, Robert Pattinson, Elizabeth Debicki",
            "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
        ),
        arrayOf(
            "https://awsimages.detik.net.id/community/media/visual/2021/07/19/the-tomorrow-war.png?w=700&q=90",
            "The Tomorrow War",
            "Action, Adventure, Sci-Fi",
            "2h 4m",
            "2021",
            "Amazon Prime Video",
            "6.9",
            "Chris McKay",
            "Chris Pratt, Yvonne Strahovski, J.K. Simmons",
            "When the world is in a state of chaos, a group of heroes from the past and present come together to fight an alien threat that could destroy the planet and all life on it."
        )
    )

    val listMovieData: ArrayList<Movie>
        get() {
            val list = arrayListOf<Movie>()
            for (aData in data) {
                val movie = Movie()
                movie.photo = aData[0]
                movie.title = aData[1]
                movie.genre = aData[2]
                movie.duration = aData[3]
                movie.year = aData[4]
                movie.platform = aData[5]
                movie.rating = aData[6]
                movie.director = aData[7]
                movie.cast = aData[8]
                movie.description = aData[9]
                list.add(movie)
            }
            return list
        }
}