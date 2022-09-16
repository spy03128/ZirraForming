import { Canvas } from "@react-three/fiber";
import { Stars, PerspectiveCamera, ScrollControls } from "@react-three/drei";
import styled from "styled-components";

import Earth from "../components/three/Earth";
import { Suspense } from "react";

const CanvasWrap = styled.div`
  width: 100vw;
  height: 100vh;
  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),
    url("/assets/bg/space.jfif");
  background-position: center center;
  background-size: cover;
  color: ${(props) => props.theme.lightWhite};
  font-family: "Black Han Sans";
`;
function Main() {
  return (
    <CanvasWrap>
      <Canvas
        gl={{ antialias: false }}
        style={{
          width: "100vw",
          height: "100vh",

          // backgroundColor: "black",
        }}
      >
        <ScrollControls pages={4}>
          <Earth />
          <ambientLight intensity={1} color="white" />
        </ScrollControls>
      </Canvas>
    </CanvasWrap>
  );
}
export default Main;
