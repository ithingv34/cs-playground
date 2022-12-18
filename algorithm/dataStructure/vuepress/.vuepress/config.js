const { getFilesOf } = require('./util.js');

module.exports = {
  base: '/java_datastructure/',
  assetsPublicPath: '/',
  title: "자료구조",
  plugins: ['@vuepress/last-updated'],
  themeConfig: {
    nav: [
      { text: 'Home', link: '/' }
    ],
    sidebar: [
      ['/', 'DataStructure'],
      {
        title: 'Math',
        path: '/docs/Math/',
        children: getFilesOf('docs/Math'),
      },
      {
        title: 'Array',
        path: '/docs/Array/',
        children: getFilesOf('docs/Array'),
      },
      {
        title: 'LinkedList',
        path: '/docs/LinkedList/',
        children: getFilesOf('docs/LinkedList'),
      },
      {
        title: 'Stack',
        path: '/docs/Stack/',
        children: getFilesOf('docs/Stack'),
      },
      {
        title: 'Queue',
        path: '/docs/Queue/',
        children: getFilesOf('docs/Queue'),
      },
      {
        title: 'HashTable',
        path: '/docs/HashTable/',
        children: getFilesOf('docs/HashTable'),
      },
      {
        title: 'Tree',
        path: '/docs/Tree/',
        children: getFilesOf('docs/Tree'),
      },
      {
        title: 'Heap',
        path: '/docs/Heap/',
        children: getFilesOf('docs/Heap'),
      },
      {
        title: 'Graph',
        path: '/docs/Graph/',
        children: getFilesOf('docs/Graph'),
      },
      {
        title: 'Trie',
        path: '/docs/Trie/',
        children: getFilesOf('docs/Trie'),
      }
    ],
    repo: 'ithingv34/vuepress_template',
    repoLabel: 'GitHub',
    editLinks: true,
    docsBranch: 'main',
    editLinkText: 'Edit this page🙌!',
  },
};
