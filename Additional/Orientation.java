package Additional;

public enum Orientation {
    N {
        @Override
        public Orientation rotateRight() {
            return E;
        }

        @Override
        public Orientation rotateLeft() {
            return W;
        }
    },
    W {
        @Override
        public Orientation rotateRight() {
            return N;
        }

        @Override
        public Orientation rotateLeft() {
            return S;
        }
    },
    S {
        @Override
        public Orientation rotateRight() {
            return W;
        }

        @Override
        public Orientation rotateLeft() {
            return E;
        }
    },
    E {
        @Override
        public Orientation rotateRight() {
            return S;
        }

        @Override
        public Orientation rotateLeft() {
            return N;
        }
    };
    public abstract Orientation rotateRight();

    public abstract Orientation rotateLeft();

}
