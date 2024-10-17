% Faits
maman(marge, bart).
maman(marge, lisa).
maman(marge, maggie).

papa(homer, bart).
papa(homer, lisa).
papa(homer, maggie).

% Règles
parent(X, Y) :- maman(X, Y) ; papa(X, Y).