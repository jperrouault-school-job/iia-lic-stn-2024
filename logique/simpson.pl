% Faits
maman(marge, bart).
maman(marge, lisa).
maman(marge, maggie).

maman(mona, homer).
maman(jacqueline, marge).

papa(homer, bart).
papa(homer, lisa).
papa(homer, maggie).

papa(abraham, homer).
papa(clancy, marge).

% Règles
parent(X, Y) :- maman(X, Y) ; papa(X, Y).
grandparent(X, Z) :- parent(X, Y) , parent(Y, Z).